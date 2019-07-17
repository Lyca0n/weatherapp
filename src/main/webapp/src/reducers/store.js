import * as constants from '../config/constants';

const storeReducerDefaultState = {
    entity: {},
    entities: [],
    loading: false
};

export default (state = storeReducerDefaultState, action) => {
    switch (action.type) {
        case constants.ADD_STORE:
            return { ...state, entity: action.payload.data };
        case constants.ADD_STORES:        
            return {
                ...state,
                entities: action.payload.data.stores
            }
        default:
            return state;
    }
};
