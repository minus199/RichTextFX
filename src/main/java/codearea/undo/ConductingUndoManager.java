package codearea.undo;

public interface ConductingUndoManager<C> extends UndoManager {
    void apply(C change);
}