package edu.baylor.ecs.cil;

import org.neo4j.driver.types.Node;

public class MetaSystem {

    public Long id;

    public String name;

    public static MetaSystem from(Node node) {
        return new MetaSystem(node.id(), node.get("name").asString());
    }

    public MetaSystem() {
        // This is neaded for the REST-Easy JSON Binding
    }

    public MetaSystem(String name) {
        this.name = name;
    }

    public MetaSystem(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}