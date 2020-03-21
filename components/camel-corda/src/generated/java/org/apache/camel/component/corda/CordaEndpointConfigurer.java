/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.corda;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CordaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        CordaEndpoint target = (CordaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "contractstateclass":
        case "contractStateClass": target.getConfiguration().setContractStateClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "flowlogicarguments":
        case "flowLogicArguments": target.getConfiguration().setFlowLogicArguments(property(camelContext, java.lang.Object[].class, value)); return true;
        case "flowlogicclass":
        case "flowLogicClass": target.getConfiguration().setFlowLogicClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "pagespecification":
        case "pageSpecification": target.getConfiguration().setPageSpecification(property(camelContext, net.corda.core.node.services.vault.PageSpecification.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "processsnapshot":
        case "processSnapshot": target.getConfiguration().setProcessSnapshot(property(camelContext, boolean.class, value)); return true;
        case "querycriteria":
        case "queryCriteria": target.getConfiguration().setQueryCriteria(property(camelContext, net.corda.core.node.services.vault.QueryCriteria.class, value)); return true;
        case "sort": target.getConfiguration().setSort(property(camelContext, net.corda.core.node.services.vault.Sort.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}
