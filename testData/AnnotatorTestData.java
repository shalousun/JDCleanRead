/**
 * normal and <b><info descr="null">bold</info></b> text
 * normal and <i><info descr="null">italic</info></i> text
 * normal and <code><info descr="null">code</info></code> text
 * normal and <tt><info descr="null">tt</info></tt> text
 * html link <a href="http://www.jetbrains.org"><info descr="null">JetBrains</info></a>
 * <a link="">NOT valid link tag</a>
 * <a name="ooo"><info descr="null">not a html link but a_name tag</info></a>
 * {@code<info descr="null"> code_tag</info>}
 * {@code<info descr="null"> <b>not_bold</b></info>}
 * {@code<info descr="null"> multiline</info>
 * <info descr="null">code_tag</info>}
 * {@literal <b>not_bold</b>}
 * {@link #<info descr="null">link_tag</info> link_name}
 * <!-- not a tag --> jjj -->
 *
 * inline <b><info descr="null">bold tag </info></b> and multiline <b><info descr="null"> bold </info>
 * <info descr="null">tag</info></b> with another multiline <b><info descr="null"> bold tag </info>
 * </b> with inline <b><info descr="null">bold tag</info></b>.
 *
 * multiline html tag with nested javadoc tag: <pre><info descr="null">{@code</info>
 * <info descr="null"><info descr="null">   tag body</info></info>
 * <info descr="null">}</info></pre>
 *
 * multiline tag start <info descr="null"><b </info>
 * <info descr="null">></info><info descr="null"> with multiline end </info><info descr="null"></b </info>
 * <info descr="null">></info>
 *
 * milti line href tag <info descr="null"><a </info>
 * <info descr="null">href=</info>
 * <info descr="null">"www"></info><info descr="null"> with multiline </info>
 * <info descr="null">tag value </info></a>
 */

public class AnnotatorTestData {

}