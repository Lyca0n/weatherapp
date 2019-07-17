import React from 'react';
import { connect } from 'react-redux';
import { fetchAll as fetchStores } from '../../actions/store';
import { fetchAll as fetchErrors } from '../../actions/store_error';
import { fetchAll as fetchBatchUpdates } from '../../actions/batch_update';
import { XYPlot, XAxis, YAxis, HorizontalGridLines, LineSeries, RadialChart, VerticalBarSeries, HorizontalBarSeries, HorizontalRectSeries, VerticalGridLines } from 'react-vis';
import { countBy } from '../../selectors/graph_prep';
import Splash from '../common/Loader';

class HomePage extends React.Component {
    constructor(props) {
        super(props);
    }

    componentWillMount() {
        this.props.fetchStores();
        this.props.fetchErrors();
        this.props.fetchBatchUpdates();
    }

    render() {
        const { batchUpdates, storeErrors, stores } = this.props;
        if (batchUpdates.length > 0 && storeErrors.length > 0) {
            const batchPrep = countBy(this.props.batchUpdates, 'batch_number');
            const illStoreSummary = storeErrors.map((rec) => (rec.store_id));
            const errorPrep = stores.filter((rec)=>( illStoreSummary.includes(rec.storenum)));
            console.log(errorPrep);

            return (
                <div className="page-container">
                    <div className="section" >
                        <div className="content-container">
                            <div className="section__title">
                                Dashboard
                            </div>
                            <div className="cards__container">
                                <div className="card">
                                    <h3>Active Error Reports: {storeErrors.length}</h3>
                                </div>
                                <div className="card">
                                    <h3>New Updates: {batchUpdates.length}</h3>
                                </div>
                            </div>
                            <div className="cards__container">
                                <div className="card">
                                    <h4>Batch Applied</h4>
                                    <XYPlot
                                        width={300}
                                        height={300}>
                                        <HorizontalGridLines />
                                        <VerticalGridLines />
                                        <LineSeries
                                            data={Object.entries(batchPrep).map((rec) => ({ x: rec[0], y: rec[1] }))} />
                                        <XAxis title={"Batch Number"} />
                                        <YAxis title={"Stores Updated"} />
                                    </XYPlot>
                                </div>
                                <div className="card">
                                    <h4>Store Health</h4>  
                                    <RadialChart                                        
                                        data={[{ label: "Error" , angle: errorPrep.length }, { label: "Healthy", angle: stores.length }]}
                                        width={300}
                                        height={300} showLabels={true}/>
                                </div>
                                <div className="card">
                                    other chat here.
                                </div>
                            </div>
                        </div>
                    </div>

                </div>
            );
        }
        return (
        <div className="page-container">
            <div className="section" >
                <div className="content-container">
                    <Splash />
                </div>
            </div>
        </div>
        );


    }
}

const mapStateToProps = (state) => ({
    stores: state.store.entities,
    storeErrors: state.storeError.entities,
    batchUpdates: state.batchUpdate.entities
})

const mapDispatchToProps = {
    fetchStores,
    fetchErrors,
    fetchBatchUpdates
};

export default connect(mapStateToProps, mapDispatchToProps)(HomePage);