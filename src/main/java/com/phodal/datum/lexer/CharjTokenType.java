package com.phodal.datum.lexer;

import com.intellij.psi.tree.IElementType;
import com.phodal.datum.CharjLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CharjTokenType extends IElementType {
    public CharjTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CharjLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CharjTokenType." + super.toString();
    }
}
