package curso.singleton;

public class ConfigManager {
	
	private String serverName;
	
	private static ConfigManager instance;
	
	private ConfigManager() {
		//carregar arquivo de propriedades
	}
	
	public static ConfigManager getInstance() {
		
		if(ConfigManager.instance == null)
			ConfigManager.instance = new ConfigManager();
		
		return ConfigManager.instance;
		
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

}
