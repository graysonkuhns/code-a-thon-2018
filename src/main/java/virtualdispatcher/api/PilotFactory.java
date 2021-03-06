package virtualdispatcher.api;

import com.google.inject.assistedinject.Assisted;

/**
 * {@link Pilot} factory.
 *
 * @author Grayson Kuhns
 */
public interface PilotFactory {

    /**
     * Creates a {@link Pilot}.
     *
     * @param id The ID.
     * @param firstName The pilot first name.
     * @param lastName The pilot last name.
     *
     * @return The {@link Pilot}.
     */
    Pilot create(
            @Assisted("id") int id,
            @Assisted("firstName") String firstName,
            @Assisted("lastName") String lastName);
}
