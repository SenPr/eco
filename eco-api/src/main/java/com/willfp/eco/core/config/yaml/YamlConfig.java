package com.willfp.eco.core.config.yaml;

import com.willfp.eco.core.Eco;
import com.willfp.eco.core.config.yaml.wrapper.YamlConfigWrapper;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.NotNull;

import java.io.StringReader;

/**
 * Config implementation for passing YamlConfigurations.
 * <p>
 * Does not automatically update.
 */
public class YamlConfig extends YamlConfigWrapper {
    /**
     * @param config     The YamlConfiguration handle.
     */
    public YamlConfig(@NotNull final YamlConfiguration config) {
        super(Eco.getHandler().getConfigFactory().createYamlConfig(config));
    }

    /**
     * @param contents     The contents of the config.
     */
    public YamlConfig(@NotNull final String contents) {
        super(Eco.getHandler().getConfigFactory().createYamlConfig(YamlConfiguration.loadConfiguration(new StringReader(contents))));
    }
}
