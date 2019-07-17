import * as constants from '../config/constants';

const storeErrorReducerDefaultState = {
    entity: {},
    entities: [],
    loading: false
};

export default (state = storeErrorReducerDefaultState, action) => {
    switch (action.type) {
        case constants.ADD_STORE_ERROR:
            return { ...state, entity: action.payload.data };
        case constants.ADD_STORE_ERRORS:
            return {
                ...state,
                entities: action.payload.data.errors
            }
        default:
            return state;
    }
};
