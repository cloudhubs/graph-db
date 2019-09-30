package edu.baylor.ecs.cil.model.nodes;

import edu.baylor.ecs.cil.model.abstracts.Entity;
import org.neo4j.ogm.annotation.NodeEntity;

//ToDo: Class owns methods but detecting polymorphism?
//ToDo: How to detect relationship in implementing interfaces?

@NodeEntity(label="Class")
public class MetaClass extends Entity {
    private String type;
    private String name;
}
