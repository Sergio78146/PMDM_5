package es.studium.practica5finalfinal.ui.pintor;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import es.studium.practica5finalfinal.databinding.FragmentPintorBinding;

public class PintorFragment extends Fragment {

    private FragmentPintorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PintorViewModel homeViewModel =
                new ViewModelProvider(this).get(PintorViewModel.class);

        binding = FragmentPintorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textPintor;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}