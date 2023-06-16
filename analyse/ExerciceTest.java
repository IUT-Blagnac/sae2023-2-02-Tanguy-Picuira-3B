package test;

import exercice.Exercice;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExerciceTest {
    @Test
    public void testSolution() {
        // Chaine simple avec ordre complet
        assertEquals(List.of("666","the", "the", "number", "of", "beast"), Exercice.solution("666, the number of the beast",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine à 1 mot
        assertEquals("Erreur de chaine à 1 mot", List.of("OK"), Exercice.solution("OK",List.of('a', 'b', 'c', 'd', 'e')));
        // Chaine vide
        assertEquals(List.of(), Exercice.solution("",List.of('6', 't', 'n', 'o', 'b')));
        // Chaine donnée en exemple
        assertEquals(List.of("fait", "Il", "aujourd", "aout", "beau", "hui", "comme", "en"), Exercice.solution("Il fait beau aujourd'hui comme en aout",List.of('f', 'I', 'z', 'u', 'k', 'a', 'b', 'o')));
        // Ajoutez vos test ici...
        assertEquals(List.of("classer", "texte", "exemple", "a", "de"), Exercice.solution("exemple de texte a classer",List.of('c', 't', 'e', 'x', 'a', 'm', 'p', 'l', 's', 'r', 'd')));
        //assertEquals(List.of(), Exercice.solution("", List.of('a', 'b', 'c', 'd', 'e')));
        assertEquals(List.of("aaa", "bbb", "ccc"), Exercice.solution("aaa bbb ccc", List.of('a', 'b', 'c')));
    }
}