package com.spring;

/**
 * @ClassName : BeanDefinition
 * @Description :
 * @Author : cybersa
 * @Date: 2020-08-11 19:02
 */
public class BeanDefinition {
    private String scope;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    private Class beanClass;
}
