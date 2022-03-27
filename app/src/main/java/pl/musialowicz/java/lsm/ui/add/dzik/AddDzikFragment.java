package pl.musialowicz.java.lsm.ui.add.dzik;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import pl.musialowicz.java.lsm.R;
import pl.musialowicz.java.lsm.databinding.FragmentAddDzikBinding;

public class AddDzikFragment extends Fragment implements View.OnClickListener
{

    private FragmentAddDzikBinding binding;

    private NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        binding = FragmentAddDzikBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        initializeListeners( root );
        return root;
    }

    @Override
    public void onViewCreated( @NonNull View view, @Nullable Bundle savedInstanceState )
    {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController( view );
    }

    @Override
    public void onDestroyView()
    {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view)
    {
        if ( view.getId() == R.id.confirmAddDzikButton )
        {
            navigateToHomeFragment();
            // more logic will be added in the future
        }
        else if ( view.getId() == R.id.cancelAddDzikButton )
        {
            navigateToHomeFragment();
        }
    }

    private void navigateToHomeFragment()
    {
        navController.navigate( R.id.action_addDzikFragment_to_navigation_home );
    }

    private void initializeListeners( View aView )
    {
        Button confirmAddDzik = aView.findViewById( R.id.confirmAddDzikButton );
        Button cancelAddDzik = aView.findViewById( R.id.cancelAddDzikButton );

        confirmAddDzik.setOnClickListener( this );
        cancelAddDzik.setOnClickListener( this );
    }
}