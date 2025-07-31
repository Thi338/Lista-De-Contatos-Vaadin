package br.com.thiagocsilva.data.repository;

import br.com.thiagocsilva.data.entity.Status;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class StatusRepository implements PanacheRepository<Status> {
}
