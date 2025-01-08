package es.studium.practica5finalfinal.ui.pintor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PintorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public PintorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Leonardo da Vinci (1452-1519) fue un pintor italiano renacentista ampliamente reconocido como uno de los artistas más brillantes e influyentes de la historia del arte. " +
                "Su obra maestra, 'La Gioconda' o 'Mona Lisa', es un icono cultural, famoso por su enigmática sonrisa y el uso innovador del sfumato para crear transiciones suaves entre luces y sombras. " +
                "Otra de sus obras más célebres, 'La Última Cena', transformó la pintura mural religiosa con su composición dramática y su representación psicológica de los apóstoles. " +
                "Leonardo combinó arte y ciencia en sus estudios sobre anatomía, perspectiva y óptica, revolucionando la práctica de la pintura y estableciendo estándares que inspiraron a generaciones de artistas.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
