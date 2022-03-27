package pl.musialowicz.java.lsm.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import pl.musialowicz.java.lsm.R;
import pl.musialowicz.java.lsm.databinding.FragmentHomeBinding;
import pl.musialowicz.java.lsm.ui.add.dzik.AddDzikFragment;

public class HomeFragment extends Fragment implements View.OnClickListener
{
    private FragmentHomeBinding binding;

    private HomeViewModel homeViewModel;

    private NavController navController;

    public View onCreateView( @NonNull LayoutInflater aInflater,
                             ViewGroup aContainer, Bundle aSavedInstanceState )
    {
        homeViewModel = new ViewModelProvider( this ).get( HomeViewModel.class );

        binding = FragmentHomeBinding.inflate( aInflater, aContainer, false );
        View root = binding.getRoot();
        initializeListeners( root );

        return binding.getRoot();
    }

    @Override
    public void onViewCreated( @NonNull View aView, @Nullable Bundle aSavedInstanceState )
    {
        super.onViewCreated( aView, aSavedInstanceState );

        binding.setViewModel( homeViewModel );
        binding.setLifecycleOwner( this );

        navController = Navigation.findNavController( aView );
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick( final View aView )
    {
        if ( aView.getId() == R.id.addBoarButton )
        {
            navigateToAddDzikFragment();
        }
    }

    private void navigateToAddDzikFragment()
    {
        navController.navigate( R.id.action_navigation_home_to_addDzikFragment );
    }

    private void initializeListeners( View aView )
    {
        Button addDzikButton = aView.findViewById( R.id.addBoarButton );
        addDzikButton.setOnClickListener( this );
    }
}