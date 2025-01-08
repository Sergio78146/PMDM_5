package es.studium.practica5finalfinal.ui.cientifico;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CientificoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public CientificoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Leonardo da Vinci (1452-1519) fue un científico italiano renacentista cuya curiosidad insaciable y enfoque multidisciplinario lo convierten en una de las figuras más influyentes de la historia de la ciencia. " +
                "Aunque nunca publicó sus hallazgos en forma académica, sus estudios abarcaron áreas como anatomía, ingeniería, física, botánica, geología, óptica y hidráulica, dejando un legado de ideas visionarias que se adelantaron siglos a su tiempo.\n\n" +
                "Además de sus logros científicos, Leonardo es considerado uno de los más grandes pintores de la historia del arte. Su obra más famosa, 'La Gioconda' o 'Mona Lisa', es célebre por su enigmática sonrisa y su innovador uso del sfumato, una técnica que da a las pinturas un efecto de transición suave entre colores y tonalidades. " +
                "Otro de sus trabajos destacados es 'La Última Cena', una representación dramática de la reacción de los apóstoles al anuncio de Jesús de que uno de ellos lo traicionará. " +
                "Estas pinturas, junto con sus numerosos bocetos y estudios, muestran su extraordinaria habilidad para combinar el arte y la ciencia, explorando temas como la anatomía humana y la perspectiva en sus obras.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
