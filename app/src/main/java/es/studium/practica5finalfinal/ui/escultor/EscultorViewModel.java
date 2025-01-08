package es.studium.practica5finalfinal.ui.escultor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EscultorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public EscultorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Leonardo da Vinci (1452-1519), aunque es conocido principalmente como pintor, científico e ingeniero, también exploró la escultura como parte de su enfoque multidisciplinario del arte y la creatividad. " +
                "Entre sus proyectos escultóricos más destacados se encuentra el diseño de un caballo colosal encargado por Ludovico Sforza, Duque de Milán, que quedó inacabado debido a la invasión francesa. " +
                "Sus bocetos detallados de esculturas y su comprensión profunda de la anatomía humana revelan su ambición de crear obras escultóricas que fusionaran perfección técnica y expresión artística.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
