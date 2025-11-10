package no.hvl.dat100.oppgave4;

import java.io.IOException;
import no.hvl.dat100.oppgave3.Blogg;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SkrivBlogg {
    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            Path path = (mappe == null || mappe.trim().isEmpty())
                    ? Paths.get(filnavn)
                    : Paths.get(mappe, filnavn);

            if (path.getParent() != null) {
                Files.createDirectories(path.getParent());
            }

            // Opprett/overskriv fil med UTF-8
            try (var bw = Files.newBufferedWriter(
                    path,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING,
                    StandardOpenOption.WRITE)) {

                bw.write(samling.toString());
            }

            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
