import React from 'react'
import './MainPage.css'

export default function MainPage() {
    return (
        <div className='home'>
            <div className='featuredItem'>
                <span className='featuredTitle'>
                    Revanue
                    <div className='featuredMoneyContainer'>
                        <span className='featuredMoney'>
                            $2,415
                        </span>
                        <span className='featuredMoneyRate'>
                            -11,4
                        </span>
                    </div>
                    <span className='featuredSub'>
                        Compared to last month
                    </span>
                </span>
            </div>

            <div className='featuredItem'>
                <span className='featuredTitle'>
                    Revanue
                    <div className='featuredMoneyContainer'>
                        <span className='featuredMoney'>
                            $2,415
                        </span>
                        <span className='featuredMoneyRate'>
                            -11,4
                        </span>
                    </div>
                    <span className='featuredSub'>
                        Compared to last month
                    </span>
                </span>
            </div>
        </div>
    )
}
