package com.example.redsocial.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.redsocial.PostActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.example.redsocial.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {

    View mView;
    FloatingActionButton mFab;

    public ChatsFragment() {
        // Required empty public constructor
    }



    private void goToPost() {
        Intent intent = new Intent(getContext(), PostActivity.class);
        startActivity(intent);
    }
}
