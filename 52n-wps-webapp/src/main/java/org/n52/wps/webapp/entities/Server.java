package org.n52.wps.webapp.entities;

import java.util.Arrays;
import java.util.List;

import org.n52.wps.webapp.api.AlgorithmEntry;
import org.n52.wps.webapp.api.ConfigurationCategory;
import org.n52.wps.webapp.api.ConfigurationKey;
import org.n52.wps.webapp.api.ConfigurationModule;
import org.n52.wps.webapp.api.types.BooleanConfigurationEntry;
import org.n52.wps.webapp.api.types.ConfigurationEntry;
import org.n52.wps.webapp.api.types.IntegerConfigurationEntry;
import org.n52.wps.webapp.api.types.StringConfigurationEntry;

/**
 * A {@link ConfigurationModule} implementation. This configuration module is used to configure the server.
 */
public class Server implements ConfigurationModule {

	private ConfigurationEntry<String> hostnameEntry = new StringConfigurationEntry("hostname", "Server Host Name", "",
			true, "localhost");
	private ConfigurationEntry<Integer> hostportEntry = new IntegerConfigurationEntry("hostport", "Server Host Port",
			"", true, 8080);
	private ConfigurationEntry<Boolean> includeDataInputsInResponseEntry = new BooleanConfigurationEntry(
			"data_inputs_in_response", "Include Data Inputs", "", true, false);
	private ConfigurationEntry<Integer> computationTimeoutEntry = new IntegerConfigurationEntry("computation_timeout",
			"Computation Timeout", "In milli seconds", true, 5);
	private ConfigurationEntry<Boolean> cacheCapabilitesEntry = new BooleanConfigurationEntry("cache_capabilites",
			"Cache Capabilities", "", true, false);
	private ConfigurationEntry<String> weppappPathEntry = new StringConfigurationEntry("weppapp_path", "Webapp Path",
			"", true, "wps");
	private ConfigurationEntry<Integer> repoReloadIntervalEntry = new IntegerConfigurationEntry("repo_reload_interval",
			"Repo Reload Interval", "(In hours. 0 = No Auto Reload)", true, 0);
	private ConfigurationEntry<Boolean> responseURLFilterEnabledEntry = new BooleanConfigurationEntry(
			"response_url_filter_enabled", "Response URL Filter Enabled", "", true, false);

	private List<? extends ConfigurationEntry<?>> configurationEntries = Arrays.asList(hostnameEntry, hostportEntry,
			computationTimeoutEntry, weppappPathEntry, repoReloadIntervalEntry, includeDataInputsInResponseEntry,
			cacheCapabilitesEntry, responseURLFilterEnabledEntry);

	private String hostname;
	private int hostport;
	private boolean includeDataInputsInResponse;
	private int computationTimeout;
	private boolean cacheCapabilites;
	private String webappPath;
	private int repoReloadInterval;
	private boolean responseURLFilterEnabled;

	@Override
	public String getModuleName() {
		return "Server Configuration";
	}

	@Override
	public boolean isActive() {
		return true;
	}

	@Override
	public void setActive(boolean active) {

	}

	@Override
	public ConfigurationCategory getCategory() {
		return ConfigurationCategory.GENERAL;
	}

	@Override
	public List<? extends ConfigurationEntry<?>> getConfigurationEntries() {
		return configurationEntries;
	}

	@Override
	public List<AlgorithmEntry> getAlgorithmEntries() {
		return null;
	}

	public String getHostname() {
		return hostname;
	}

	@ConfigurationKey(key = "hostname")
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getHostport() {
		return hostport;
	}

	@ConfigurationKey(key = "hostport")
	public void setHostport(int hostport) {
		this.hostport = hostport;
	}

	public boolean isIncludeDataInputsInResponse() {
		return includeDataInputsInResponse;
	}

	@ConfigurationKey(key = "data_inputs_in_response")
	public void setIncludeDataInputsInResponse(boolean includeDataInputsInResponse) {
		this.includeDataInputsInResponse = includeDataInputsInResponse;
	}

	public int getComputationTimeout() {
		return computationTimeout;
	}

	@ConfigurationKey(key = "computation_timeout")
	public void setComputationTimeout(int computationTimeout) {
		this.computationTimeout = computationTimeout;
	}

	public boolean isCacheCapabilites() {
		return cacheCapabilites;
	}

	@ConfigurationKey(key = "cache_capabilites")
	public void setCacheCapabilites(boolean cacheCapabilites) {
		this.cacheCapabilites = cacheCapabilites;
	}

	public String getWebappPath() {
		return webappPath;
	}

	@ConfigurationKey(key = "weppapp_path")
	public void setWebappPath(String webappPath) {
		this.webappPath = webappPath;
	}

	public int getRepoReloadInterval() {
		return repoReloadInterval;
	}

	@ConfigurationKey(key = "repo_reload_interval")
	public void setRepoReloadInterval(int repoReloadInterval) {
		this.repoReloadInterval = repoReloadInterval;
	}

	public boolean isResponseURLFilterEnabled() {
		return responseURLFilterEnabled;
	}

	@ConfigurationKey(key = "response_url_filter_enabled")
	public void setResponseURLFilterEnabled(boolean responseURLFilterEnabled) {
		this.responseURLFilterEnabled = responseURLFilterEnabled;
	}

}
