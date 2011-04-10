/*
 * Copyright (C) 2010.
 * All rights reserved.
 */
package ro.isdc.wro.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import ro.isdc.wro.extensions.manager.ExtensionsConfigurableWroManagerFactory;
import ro.isdc.wro.model.factory.WroModelFactory;
import ro.isdc.wro.model.factory.XmlModelFactory;
import ro.isdc.wro.model.resource.locator.ResourceLocator;
import ro.isdc.wro.model.resource.locator.support.UrlResourceLocator;

/**
 * An example of how resources can be managed without restarting the server.
 *
 * @author Alex Objelean
 */
public class ExternalModelConfigurableWroManagerFactory
  extends ExtensionsConfigurableWroManagerFactory {
  /**
   * {@inheritDoc}
   */
  @Override
  protected WroModelFactory newModelFactory() {
    return new XmlModelFactory() {
      @Override
      public ResourceLocator getModelResourceLocator() {
        return new UrlResourceLocator("D:\\temp\\____wro\\wro.xml");
      }
    };
  }
}
