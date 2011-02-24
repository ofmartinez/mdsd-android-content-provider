package de.mdsdacp.workflow.config;

public class ACPWorkflowConfig {
	public static final String DEFAULT_ENCODING = "UTF-8";
	
	private static ACPWorkflowConfig instance = null;
	
	private String ecorePath;
	private String genPath;
	private String genPathCodeSnippet;
	private String fileEncoding = DEFAULT_ENCODING;
	
	private ACPWorkflowConfig(){}
	
	public static void setInstance(ACPWorkflowConfig instance){
		ACPWorkflowConfig.instance = instance;
	}
	
	public static ACPWorkflowConfig getInstance(){
		if(instance==null){
			instance = new ACPWorkflowConfig();
		}
		return instance;
	}
	
	public String getEcorePath() {
		return ecorePath;
	}
	
	public void setEcorePath(String ecorePath) {
		this.ecorePath = ecorePath;
	}
	
	public String getGenPath() {
		return genPath;
	}
	
	public void setGenPath(String genPath) {
		this.genPath = genPath;
	}
	
	public String getGenPathCodeSnippet() {
		return genPathCodeSnippet;
	}
	
	public void setGenPathCodeSnippet(String genPathCodeSnippet) {
		this.genPathCodeSnippet = genPathCodeSnippet;
	}
	
	public String getFileEncoding() {
		return fileEncoding;
	}
	
	public void setFileEncoding(String fileEncoding) {
		this.fileEncoding = fileEncoding;
	}
}
