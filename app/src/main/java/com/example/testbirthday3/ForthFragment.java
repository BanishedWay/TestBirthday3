package com.example.testbirthday3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

public class ForthFragment extends Fragment {
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forth, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final MediaPlayer mediaPlayer=MediaPlayer.create(getContext(),R.raw.mus);

        view.findViewById(R.id.Fragment_forth).setOnClickListener(view1 -> {
            NavHostFragment.findNavController(com.example.testbirthday3.ForthFragment.this)
                    .navigate(R.id.action_ForthFragment_to_FinalFragment);
        });
    }
}
