package nl.tweeenveertig.model.case5;

import java.io.IOException;

public enum ToDependency {
    TO_DEPENDENCY;

    public int crashHorribly() throws IOException {
        throw new IOException();
    }
}
