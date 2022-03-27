package pl.musialowicz.java.lsm.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import pl.musialowicz.java.lsm.model.Dzik;

public class HomeViewModel extends ViewModel
{

    public MutableLiveData< List< Dzik > > mutableLiveDataOfDziks = new MutableLiveData<>();
    public LiveData< List< Dzik > > liveDataOfDziks = mutableLiveDataOfDziks;

    public HomeViewModel()
    {
        fetchDzikList();
    }

    private void fetchDzikList()
    {
        // temporary hardcoded insertion of dziks into HomeFragment, will be replaced with call to DB some day.
        final ArrayList< Dzik > tempDziks = new ArrayList<>();
        tempDziks.add( new Dzik( "Dzik1", "fajny_boar", "2", "4" ) );
        tempDziks.add( new Dzik( "Dzik2", "fajny_boar", "5", "3" ) );
        tempDziks.add( new Dzik( "Dzik3", "fajny_boar", "7", "9" ) );

        mutableLiveDataOfDziks.setValue( tempDziks );
    }


    public LiveData< List< Dzik > > getLiveDataOfDziks()
    {
        return liveDataOfDziks;
    }

    public void setLiveDataOfDziks( LiveData<List<Dzik>> aLiveDataOfDziks )
    {
        liveDataOfDziks = aLiveDataOfDziks;
    }
}