package ladr.projet.application.lesaventuriersdurail.model;

/**
 * Created by 'Anthony' on 08/12/2016.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Map extends Observable {
    private static Map instance;
    private List<Ville> ville = new ArrayList<Ville> ();
    private List<Route> route = new ArrayList<Route> ();

    private Map() {

    }

    public static Map getInstance() {
        if (null == instance) {
            instance = new Map();
        }
        return instance;
    }

}
