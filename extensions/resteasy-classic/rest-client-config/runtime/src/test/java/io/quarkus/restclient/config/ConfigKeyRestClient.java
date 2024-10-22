package io.quarkus.restclient.config;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "key")
interface ConfigKeyRestClient {
}
