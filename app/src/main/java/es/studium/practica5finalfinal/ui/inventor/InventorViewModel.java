package es.studium.practica5finalfinal.ui.inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InventorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Leonardo da Vinci (1452-1519) es considerado uno de los inventores más visionarios de la historia, adelantándose siglos a su tiempo con diseños que desafiaron los límites del conocimiento técnico y científico de su época. " +
                "Entre sus inventos más notables se encuentran prototipos de máquinas voladoras, como el ornitóptero y el paracaídas, así como diseños de tanques, armas militares y mecanismos hidráulicos. " +
                "Aunque muchos de sus inventos nunca se construyeron en vida, sus bocetos e ideas influyeron en el desarrollo de la ingeniería y siguen siendo un testimonio de su imaginación y genialidad.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
