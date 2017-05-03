package registrationTools;

/**
 * Created by tischi on 30/04/17.
 */
public class RegistrationSettings {

    String method;
    Boolean snake = false;
    int reference = 1, first = 1, last = 0, delta;
    Type type = Type.AFFINE;
    String folderElastix = "/Users/tischi/Downloads/elastix_macosx64_v4.8/";
    String folderTmp = "/Users/tischi/Desktop/tmp/";
    int iterations = 100;
    String spatialSamples = "full; 10000";
    int workers = Runtime.getRuntime().availableProcessors();
    String resolutionPyramid = "10 10; 2 2";
    int bitDepth = 8;

    public enum Type {
        TRANSLATION("Translation"),
        EULER("Euler"),
        AFFINE("Affine");

        private final String text;

        private Type(final String text) {
            this.text = text;
        }

        public String toString() {
            return text;
        }
    }
}
