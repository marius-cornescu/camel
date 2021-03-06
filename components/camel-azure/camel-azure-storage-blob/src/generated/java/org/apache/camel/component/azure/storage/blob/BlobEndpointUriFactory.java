/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.storage.blob;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class BlobEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":accountName/containerName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(47);
        props.add("blobName");
        props.add("backoffMultiplier");
        props.add("accountName");
        props.add("credentials");
        props.add("prefix");
        props.add("createPageBlob");
        props.add("initialDelay");
        props.add("blobOffset");
        props.add("timeout");
        props.add("dataCount");
        props.add("scheduler");
        props.add("blobServiceClient");
        props.add("maxRetryRequests");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("containerName");
        props.add("backoffErrorThreshold");
        props.add("closeStreamAfterRead");
        props.add("greedy");
        props.add("scheduledExecutorService");
        props.add("closeStreamAfterWrite");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("autoDiscoverClient");
        props.add("maxResultsPerPage");
        props.add("downloadLinkExpiration");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("backoffIdleThreshold");
        props.add("blockListType");
        props.add("createAppendBlob");
        props.add("regex");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("blobSequenceNumber");
        props.add("startScheduler");
        props.add("accessKey");
        props.add("commitBlockListLater");
        props.add("serviceClient");
        props.add("fileDir");
        props.add("blobType");
        props.add("pageBlobSize");
        props.add("exceptionHandler");
        props.add("operation");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(1);
        secretProps.add("accessKey");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-storage-blob".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "accountName", null, false, copy);
        uri = buildPathParameter(syntax, uri, "containerName", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

