package com.serenitydojo.checks;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class CatClassTest {
    @Test
    public void theCatClassShouldExist() throws ClassNotFoundException {
        assertThat(Class.forName("com.serenitydojo.Cat")).isNotNull();
    }

    @Test
    public void shouldBeAPet() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Cat").getSuperclass().getSimpleName()).isEqualTo("Pet");
    }

    @Test
    public void theCatClassShouldHaveAFavoriteToy() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Cat").getDeclaredField("favoriteToy").getGenericType()).isEqualTo(String.class);
    }

    @Test
    public void theCatClassShouldHaveAMethodCalledMakeNoise() throws Exception {
        assertThat(Class.forName("com.serenitydojo.Cat").getMethod("makeNoise").getReturnType()).isEqualTo(String.class);
    }

    @Test
    public void theCatClassShouldHaveAConstantField_MAKE_NOISE() throws Exception {
        Field makeNoise = Class.forName("com.serenitydojo.Cat").getDeclaredField("CAT_NOISE");
        assertThat(makeNoise.getType()).isEqualTo(String.class);
        assertThat(Modifier.isFinal(makeNoise.getModifiers())).isTrue();
        assertThat(Modifier.isStatic(makeNoise.getModifiers())).isTrue();
    }
}
