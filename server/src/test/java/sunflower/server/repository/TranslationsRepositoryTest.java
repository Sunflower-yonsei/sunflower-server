package sunflower.server.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class TranslationsRepositoryTest {

    @Autowired
    private TranslationsRepository translationsRepository;
}