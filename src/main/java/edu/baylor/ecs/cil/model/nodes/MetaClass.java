package edu.baylor.ecs.cil.model.nodes;

import edu.baylor.ecs.cil.model.abstracts.Entity;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity(label="Class")
public class MetaClass extends Entity {
    private String type;
    private String name;
}
