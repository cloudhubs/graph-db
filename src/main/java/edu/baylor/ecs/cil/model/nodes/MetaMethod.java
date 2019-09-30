package edu.baylor.ecs.cil.model.nodes;


import edu.baylor.ecs.cil.model.abstracts.Entity;
import org.neo4j.ogm.annotation.NodeEntity;

//ToDo: Polymorphism in nodes?

@NodeEntity
public class MetaMethod extends Entity {
    private String type;
    private String name;

}
