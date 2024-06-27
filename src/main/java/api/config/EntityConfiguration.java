package api.config;

import services.TimeEntryService;

public enum EntityConfiguration {
    TIME {
        @Override
        public Class<?> getEntityService() {
            return TimeEntryService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



