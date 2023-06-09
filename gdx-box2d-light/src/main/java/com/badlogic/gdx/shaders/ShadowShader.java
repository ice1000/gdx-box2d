package com.badlogic.gdx.shaders;

import com.badlogic.gdx.graphics.glutils.ShaderProgram;

import static com.badlogic.gdx.shaders.DiffuseShader.createShaderProgram;

public final class ShadowShader {
  static public ShaderProgram createShadowShader() {
    final String vertexShader = "attribute vec4 a_position;\n" //
        + "attribute vec2 a_texCoord;\n" //
        + "varying vec2 v_texCoords;\n" //
        + "\n" //
        + "void main()\n" //
        + "{\n" //
        + "   v_texCoords = a_texCoord;\n" //
        + "   gl_Position = a_position;\n" //
        + "}\n";
    final String fragmentShader = "#ifdef GL_ES\n" //
        + "precision lowp float;\n" //
        + "#define MED mediump\n"
        + "#else\n"
        + "#define MED \n"
        + "#endif\n" //
        + "varying MED vec2 v_texCoords;\n" //
        + "uniform sampler2D u_texture;\n" //
        + "uniform vec4 ambient;\n"
        + "void main()\n"//
        + "{\n" //
        + "vec4 c = texture2D(u_texture, v_texCoords);\n"//
        + "gl_FragColor.rgb = c.rgb * c.a + ambient.rgb;\n"//
        + "gl_FragColor.a = ambient.a - c.a;\n"//
        + "}\n";
    return createShaderProgram(vertexShader, fragmentShader);
  }
}
