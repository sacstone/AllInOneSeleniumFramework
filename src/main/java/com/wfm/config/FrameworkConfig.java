package com.wfm.config;

import com.wfm.config.converters.StringToBrowserTypeConverter;
import enums.BrowserRemoteModeType;
import enums.BrowserType;
import enums.RunModeBrowserType;
import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties"

})
public interface FrameworkConfig extends Config {


    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();




}
