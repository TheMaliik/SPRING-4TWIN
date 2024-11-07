package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Subscription;

import java.util.List;

public interface IsubscriptionServices {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);

    Subscription retrieveSubscription(Long numSub);

    List<Subscription> retrieveAllSubscription();

    void removeSubscription(Long numSub);

}
