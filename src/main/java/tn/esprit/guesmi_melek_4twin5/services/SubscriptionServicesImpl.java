package tn.esprit.guesmi_melek_4twin5.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.guesmi_melek_4twin5.entities.Skier;
import tn.esprit.guesmi_melek_4twin5.entities.Subscription;
import tn.esprit.guesmi_melek_4twin5.repositories.ISkierRepository;
import tn.esprit.guesmi_melek_4twin5.repositories.ISubscriptionRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SubscriptionServicesImpl implements IsubscriptionServices {
    private final ISubscriptionRepository subscriptionRepository;
    @Override
    public Subscription addSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription updateSubscription(Subscription subscription) {
        return subscriptionRepository.save(subscription);
    }

    @Override
    public Subscription retrieveSubscription(Long numSub) {
        return subscriptionRepository.findById(numSub).orElse(null);
    }

    @Override
    public List<Subscription> retrieveAllSubscription() {
        return (List<Subscription>) subscriptionRepository.findAll();
    }

    @Override
    public void removeSubscription(Long numSub) {
        subscriptionRepository.deleteById(numSub);
    }
}
