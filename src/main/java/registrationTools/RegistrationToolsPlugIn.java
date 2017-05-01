package registrationTools;

import ij.plugin.PlugIn;

import javax.swing.*;

public class RegistrationToolsPlugIn implements PlugIn {

    @Override
    public void run(String s)
    {
        RegistrationToolsGUI registrationToolsGUI = new RegistrationToolsGUI();

        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                RegistrationToolsGUI.showDialog();
            }
        });

    }


    // main method for debugging
    // throws ImgIOException
    public void main(String[] args)
    {
        // set the plugins.dir property to make the plugin appear in the Plugins menu
        Class<?> clazz = RegistrationToolsPlugIn.class;
        String url = clazz.getResource("/" + clazz.getName().replace('.', '/') + ".class").toString();
        String pluginsDir = url.substring("file:".length(), url.length() - clazz.getName().length() - ".class".length
                ());
        System.setProperty("plugins.dir", pluginsDir);

        // start ImageJ
        new ij.ImageJ();

        // set the plugins.dir property to make the plugin appear in the Plugins menu
        run("");
    }

}
