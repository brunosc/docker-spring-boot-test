export default class StateService {

    constructor(resource) {
        this._resource = resource('');
    }

    findAll() {
        return this._resource
                .query()
                .then(res => res.json(), err => {
                    console.log(err);
                    throw new Error('Error');
                });
    }

    seed() {
        return this._resource.save();
    }

}