package com.wjy.section6.section6_6;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionVisitor;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.StringValueResolver;

import java.util.HashSet;
import java.util.Set;

public class ObscenityRemovingBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private Set<String> obscenties;

    public ObscenityRemovingBeanFactoryPostProcessor() {
        this.obscenties = new HashSet<>(16);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanNames = beanFactory.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            BeanDefinition bd = beanFactory.getBeanDefinition(beanName);
            StringValueResolver resolver = strVal -> {
                if (isObscene(strVal)) {
                    return "*****";
                }
                return strVal;
            };
            BeanDefinitionVisitor beanDefinitionVisitor = new BeanDefinitionVisitor(resolver);
            beanDefinitionVisitor.visitBeanDefinition(bd);
        }
    }

    public boolean isObscene(Object value) {
        String potentialObscenity = value.toString().toUpperCase();
        return obscenties.contains(value);
    }

    public void setObscenties(Set<String> obscenties) {
        this.obscenties.clear();
        for (String obscenty : obscenties) {
            this.obscenties.add(obscenty.toUpperCase());
        }
    }
}
