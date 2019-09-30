package edu.baylor.ecs.cil.model.nodes;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Represents any type of variable, object
 */
//ToDo: Token as third abstraction - representation of the metatype within the body of the method
    //ToDo: decision type constructs of the language: if, for (while) as fourth type
@NodeEntity
public class MetaType {
    private String name;
}
