/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.bigquery;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GoogleBigQueryEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleBigQueryEndpoint target = (GoogleBigQueryEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.getConfiguration().setConnectionFactory(property(camelContext, org.apache.camel.component.google.bigquery.GoogleBigQueryConnectionFactory.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "useasinsertid":
        case "useAsInsertId": target.getConfiguration().setUseAsInsertId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
