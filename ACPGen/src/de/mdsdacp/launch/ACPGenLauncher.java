package de.mdsdacp.launch;

import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

import de.mdsdacp.workflow.ACPWorkflowImpl;
import de.mdsdacp.workflow.config.ACPWorkflowConfig;

/**
 * 
 * @author Frederik Goetz
 */
public class ACPGenLauncher {
    private static final String TAG = "de.mdsdacp.launch.ACPGenLauncher";
    private static final boolean DEBUG = false;

    /**
     * 
     * @param monitor
     * @param ecorePath
     * @param genPath
     */
    public static void run(final ProgressMonitor monitor, final String ecorePath, final String genPath) {
        if (DEBUG) {
            System.out.println("DEBUG: " + TAG);
        }

        run(monitor, ecorePath, genPath, ACPWorkflowConfig.DEFAULT_ENCODING);
    }

    /**
     * 
     * @param monitor
     * @param ecorePath
     * @param genPath
     * @param fileEncoding
     */
    public static void run(final ProgressMonitor monitor, final String ecorePath, final String genPath,
            final String fileEncoding) {
        if (DEBUG) {
            System.out.println("DEBUG: " + TAG);
        }

        run(monitor, ecorePath, genPath, genPath, fileEncoding);
    }

    /**
     * 
     * @param monitor
     * @param ecorePath
     * @param genPath
     * @param snippetPath
     * @param fileEncoding
     */
    public static void run(final ProgressMonitor monitor, final String ecorePath, final String genPath,
            final String snippetPath, final String fileEncoding) {
        if (DEBUG) {
            System.out.println("DEBUG: " + TAG);
        }

        ACPWorkflowConfig config = ACPWorkflowConfig.getInstance();

        config.setFileEncoding(fileEncoding);
        config.setGenPath(genPath);
        config.setGenPathCodeSnippet(snippetPath);

        String osName = System.getProperty("os.name");
        if (osName.contains("Windows")) {
            config.setEcorePath(ecorePath.replaceAll("\\\\", "/"));
        } else {
            config.setEcorePath(ecorePath);
        }

        new ACPWorkflowImpl(config).run(monitor);
    }
}
