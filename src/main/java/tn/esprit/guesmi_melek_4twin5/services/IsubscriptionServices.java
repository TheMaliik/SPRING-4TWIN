package tn.esprit.guesmi_melek_4twin5.services;

import tn.esprit.guesmi_melek_4twin5.entities.Subscription;
import tn.esprit.guesmi_melek_4twin5.entities.TypeSubscription;

import java.util.List;
import java.util.Set;

public interface IsubscriptionServices {

    Subscription addSubscription(Subscription subscription);
    Subscription updateSubscription(Subscription subscription);

    Subscription retrieveSubscription(Long numSub);

    List<Subscription> retrieveAllSubscription();

    void removeSubscription(Long numSub);

    Set<Subscription> getSubscriptionByType(TypeSubscription type);



}
