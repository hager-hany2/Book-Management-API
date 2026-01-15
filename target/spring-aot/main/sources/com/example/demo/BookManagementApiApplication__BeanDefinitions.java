package com.example.demo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link BookManagementApiApplication}.
 */
@Generated
public class BookManagementApiApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'bookManagementApiApplication'.
   */
  public static BeanDefinition getBookManagementApiApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(BookManagementApiApplication.class);
    beanDefinition.setInstanceSupplier(BookManagementApiApplication::new);
    return beanDefinition;
  }
}
