package com.fransunisoft.coronavirus;


import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

import com.fransunisoft.coronavirus.utils.Tools;
import com.fransunisoft.coronavirus.utils.ViewAnimation;


public class Question extends AppCompatActivity {

    private View parent_view;
    private NestedScrollView nested_scroll_view;
    private ImageButton bt_toggle_info1, bt_toggle_info2, bt_toggle_info3, bt_toggle_info4, bt_toggle_info5, bt_toggle_info6, bt_toggle_info7;
    private ImageButton bt_toggle_info8, bt_toggle_info9, bt_toggle_info10, bt_toggle_info11, bt_toggle_info12, bt_toggle_info13, bt_toggle_info14;
    private ImageButton bt_toggle_info15, bt_toggle_info16, bt_toggle_info17, bt_toggle_info18, bt_toggle_info19, bt_toggle_info20;
    private View lyt_expand_info1, lyt_expand_info2, lyt_expand_info3, lyt_expand_info4, lyt_expand_info5, lyt_expand_info6, lyt_expand_info7;
    private View lyt_expand_info8, lyt_expand_info9, lyt_expand_info10, lyt_expand_info11, lyt_expand_info12, lyt_expand_info13, lyt_expand_info14;
    private View lyt_expand_info15, lyt_expand_info16, lyt_expand_info17, lyt_expand_info18, lyt_expand_info19, lyt_expand_info20;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        getSupportActionBar().setTitle("Coronavirus");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        initComponent();
    }


    private void initComponent() {
        // info item_section
        bt_toggle_info1 = (ImageButton) findViewById(R.id.bt_toggle_info1);
        lyt_expand_info1 = (View) findViewById(R.id.lyt_expand_info1);

        bt_toggle_info1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo(bt_toggle_info1);
            }
        });


        //
        bt_toggle_info2 = (ImageButton) findViewById(R.id.bt_toggle_info2);
        lyt_expand_info2 = (View) findViewById(R.id.lyt_expand_info2);

        bt_toggle_info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo2(bt_toggle_info2);
            }
        });

        nested_scroll_view = (NestedScrollView) findViewById(R.id.nested_scroll_view);

        //
        bt_toggle_info3 = (ImageButton) findViewById(R.id.bt_toggle_info3);
        lyt_expand_info3 = (View) findViewById(R.id.lyt_expand_info3);

        bt_toggle_info3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo3(bt_toggle_info3);
            }
        });

        //
        bt_toggle_info4 = (ImageButton) findViewById(R.id.bt_toggle_info4);
        lyt_expand_info4 = (View) findViewById(R.id.lyt_expand_info4);

        bt_toggle_info4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo4(bt_toggle_info4);
            }
        });

        //
        bt_toggle_info5 = (ImageButton) findViewById(R.id.bt_toggle_info5);
        lyt_expand_info5 = (View) findViewById(R.id.lyt_expand_info5);

        bt_toggle_info5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo5(bt_toggle_info5);
            }
        });

        //
        bt_toggle_info6 = (ImageButton) findViewById(R.id.bt_toggle_info6);
        lyt_expand_info6 = (View) findViewById(R.id.lyt_expand_info6);

        bt_toggle_info6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo6(bt_toggle_info6);
            }
        });

        //
        bt_toggle_info7 = (ImageButton) findViewById(R.id.bt_toggle_info7);
        lyt_expand_info7 = (View) findViewById(R.id.lyt_expand_info7);

        bt_toggle_info7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo7(bt_toggle_info7);
            }
        });

        //
        bt_toggle_info8 = (ImageButton) findViewById(R.id.bt_toggle_info8);
        lyt_expand_info8 = (View) findViewById(R.id.lyt_expand_info8);

        bt_toggle_info8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo8(bt_toggle_info8);
            }
        });

        //
        bt_toggle_info9 = (ImageButton) findViewById(R.id.bt_toggle_info9);
        lyt_expand_info9 = (View) findViewById(R.id.lyt_expand_info9);

        bt_toggle_info9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo9(bt_toggle_info9);
            }
        });

        //
        bt_toggle_info10 = (ImageButton) findViewById(R.id.bt_toggle_info10);
        lyt_expand_info10 = (View) findViewById(R.id.lyt_expand_info10);

        bt_toggle_info10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo10(bt_toggle_info10);
            }
        });

        bt_toggle_info11 = (ImageButton) findViewById(R.id.bt_toggle_info11);
        lyt_expand_info11 = (View) findViewById(R.id.lyt_expand_info11);

        bt_toggle_info11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo11(bt_toggle_info11);
            }
        });

        bt_toggle_info12 = (ImageButton) findViewById(R.id.bt_toggle_info12);
        lyt_expand_info12 = (View) findViewById(R.id.lyt_expand_info12);

        bt_toggle_info12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo12(bt_toggle_info12);
            }
        });

        bt_toggle_info13 = (ImageButton) findViewById(R.id.bt_toggle_info13);
        lyt_expand_info13 = (View) findViewById(R.id.lyt_expand_info13);

        bt_toggle_info13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo13(bt_toggle_info13);
            }
        });

        bt_toggle_info14 = (ImageButton) findViewById(R.id.bt_toggle_info14);
        lyt_expand_info14 = (View) findViewById(R.id.lyt_expand_info14);

        bt_toggle_info14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo14(bt_toggle_info14);
            }
        });

        bt_toggle_info15 = (ImageButton) findViewById(R.id.bt_toggle_info15);
        lyt_expand_info15 = (View) findViewById(R.id.lyt_expand_info15);

        bt_toggle_info15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo15(bt_toggle_info15);
            }
        });

        bt_toggle_info16 = (ImageButton) findViewById(R.id.bt_toggle_info16);
        lyt_expand_info16 = (View) findViewById(R.id.lyt_expand_info16);

        bt_toggle_info16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo16(bt_toggle_info16);
            }
        });

        bt_toggle_info17 = (ImageButton) findViewById(R.id.bt_toggle_info17);
        lyt_expand_info17 = (View) findViewById(R.id.lyt_expand_info17);

        bt_toggle_info17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo17(bt_toggle_info17);
            }
        });

        bt_toggle_info18 = (ImageButton) findViewById(R.id.bt_toggle_info18);
        lyt_expand_info18 = (View) findViewById(R.id.lyt_expand_info18);

        bt_toggle_info18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo18(bt_toggle_info18);
            }
        });

        bt_toggle_info19 = (ImageButton) findViewById(R.id.bt_toggle_info19);
        lyt_expand_info19 = (View) findViewById(R.id.lyt_expand_info19);

        bt_toggle_info19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo19(bt_toggle_info19);
            }
        });

        bt_toggle_info20 = (ImageButton) findViewById(R.id.bt_toggle_info20);
        lyt_expand_info20 = (View) findViewById(R.id.lyt_expand_info20);

        bt_toggle_info20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInfo20(bt_toggle_info20);
            }
        });


        nested_scroll_view = (NestedScrollView) findViewById(R.id.nested_scroll_view);

    }

    private void toggleSectionInfo(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info1, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info1);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info1);
        }
    }

    private void toggleSectionInfo2(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info2, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info2);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info2);
        }
    }


    private void toggleSectionInfo3(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info3, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info3);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info3);
        }
    }

    private void toggleSectionInfo4(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info4, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info4);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info4);
        }
    }

    private void toggleSectionInfo5(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info5, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info5);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info5);
        }
    }

    private void toggleSectionInfo6(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info6, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info6);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info6);
        }
    }

    private void toggleSectionInfo7(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info7, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info7);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info7);
        }
    }

    private void toggleSectionInfo8(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info8, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info8);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info8);
        }
    }

    private void toggleSectionInfo9(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info9, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info9);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info9);
        }
    }

    private void toggleSectionInfo10(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info10, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info10);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info10);
        }
    }

    private void toggleSectionInfo11(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info11, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info11);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info11);
        }
    }

    private void toggleSectionInfo12(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info12, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info12);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info12);
        }
    }

    private void toggleSectionInfo13(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info13, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info13);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info13);
        }
    }

    private void toggleSectionInfo14(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info14, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info14);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info14);
        }
    }

    private void toggleSectionInfo15(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info15, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info15);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info15);
        }
    }

    private void toggleSectionInfo16(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info16, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info16);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info16);
        }
    }

    private void toggleSectionInfo17(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info17, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info17);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info17);
        }
    }

    private void toggleSectionInfo18(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info18, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info18);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info18);
        }
    }

    private void toggleSectionInfo19(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info19, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info19);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info19);
        }
    }

    private void toggleSectionInfo20(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            ViewAnimation.expand(lyt_expand_info20, new ViewAnimation.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, lyt_expand_info20);
                }
            });
        } else {
            ViewAnimation.collapse(lyt_expand_info20);
        }
    }

    public boolean toggleArrow(View view) {
        if (view.getRotation() == 0) {
            view.animate().setDuration(200).rotation(180);
            return true;
        } else {
            view.animate().setDuration(200).rotation(0);
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        supportFinishAfterTransition();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
