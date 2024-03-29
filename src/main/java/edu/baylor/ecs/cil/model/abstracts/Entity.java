package edu.baylor.ecs.cil.model.abstracts;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;

public abstract class Entity {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }
}